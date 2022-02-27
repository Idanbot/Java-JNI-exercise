javac -h .  JniFact.java
g++ -c -I"%JAVA_HOME%\include" -I"%JAVA_HOME%\include\win32" JniFact.cpp 
g++ -shared -o native.dll JniFact.o