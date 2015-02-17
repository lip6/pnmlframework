A/ Dependency to TestNG

You Need TestNG in the build path of this project.
We have not provide it, so you must download it from
http://testng.org/doc/ and install it wherever you want
on your disk. 

Then you must edit the broken dependency to point to
testng-5.8-jdk15.jar (or whatever newer version), located at 
the root of the uncompressed folder of the TestNG downloaded archive.


All tests where we have 	assert totest.getFormattedXMLBuffer().equals(itemformattedXMLBuffer);
will fail, because the behavior is asymmetric. "Get" returns the buffer including the toolinfo element,
while "Set" directly includes the sub-elements of the toolinfo element;

