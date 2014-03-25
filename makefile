 DIRS := uoit/csci4020u/A2/

all : Lizp.class
 
Lizp.class :
	javac ${DIRS}*.java
	java ${DIRS}Lizp

clean :
	rm -f ${DIRS}*.class
