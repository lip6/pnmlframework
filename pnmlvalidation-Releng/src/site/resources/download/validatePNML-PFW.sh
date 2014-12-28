#! /bin/sh
#
#  Copyright 2009 Universite Paris Ouest and Sorbonne Universites,
# 							Univ. Paris 06 - CNRS UMR
# 							7606 (LIP6)
#
#  All rights reserved.   This program and the accompanying materials
#  are made available under the terms of the Eclipse Public License v1.0
#  which accompanies this distribution, and is available at
#  http://www.eclipse.org/legal/epl-v10.html
#
#  Project leader / Initial Contributor:
#    Lom Messan Hillah - <lom-messan.hillah@lip6.fr>
#
#  Contributors:
#    ${ocontributors} - <$oemails}>
#
#  Mailing list:
#    lom-messan.hillah@lip6.fr
#

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
