----IMPORTANT----
Must have ANTLR v4 installed along with Java 7 to compile and run.

USE:
1. Generate language by being in same directory as 'Lizp.g4'
	$ antlr4 Lizp.g4
2. Now compile all .java files including 'Lizp.java' and 'LizpSuperListener.java'
	$ javac *.java
3. Inputs to program go to 'default.txt' in order to be read.
4. TO TEST INPUT 'default.txt' FILE...
	$ java Lizp
