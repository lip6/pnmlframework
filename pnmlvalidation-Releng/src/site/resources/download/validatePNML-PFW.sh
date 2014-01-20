#! /bin/sh
#------------------------------------------------------------------------------------
# Copyright Lom M. Hillah - Date: Jan 04, 2014 - Version: 0.1 
# License: GNU GPL v3. See http://www.gnu.org/licenses/
#
# Invocation: ./validatePNML-PFW.sh pathToPNMLDocumentsFolder
# 
# This script uses PNML Document Checher to validate your PNML Documents.
# The result is redirected in a .txt file next to each document you are validating.
# This script looks into folders, so it expects as argument the path to the folder
# where your PNML Documents are located.
# http://pnml.lip6.fr/pnmlvalidation/index.html
#------------------------------------------------------------------------------------

# Path the executable jar of PNML Document Checker
JAR_PATH=fr.lip6.move.pnml.check-1.0.1.jar

# How many expected arguments to this script?
NBPARAM=1

# Error code about the file
E_NOFILE=66

# Return on error code
E_ERROR=-1

# Return on success code
E_SUCCESS=0

# Set of advanced JVM arguments. In particular, decrease (or increase) the amount of max memory allocated to the heap.
# The current setting below allocates 2 GB (-Xmx2g). Dependending on the size of the document you are validating,
# you may increase or decrease it.
JVM_ARGS="-d64 -server -Xmx2g -Xmn128m -XX:NewSize=2g -XX:MaxNewSize=2g -XX:+UseNUMA -XX:+UseConcMarkSweepGC -XX:+UseParNewGC"

if [ $# -ne "$NBPARAM" ] 
	then 
	 echo "Usage: `basename $0` pathToPNMLDocumentsFolder"
	 exit "$E_NOFILE" 
fi

# The output .txt file contains essential information about the check. 
# The .bak file contains full excution log. We keep it just for info, so you can get rid of it.

for file in $1/*.pnml
do
	java $JVM_ARGS -jar $JAR_PATH $file &> $file.pfwvalidation.txt && sed -e '1,18d' -i .bak $file.pfwvalidation.txt || exit "$E_ERROR"
done
exit "$E_SUCCESS"
