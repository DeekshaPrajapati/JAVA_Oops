package ClassLoading;

public class Defination {

    // Class Loading is the process of storing the class specific information in a memory(JVM Memory) is called a class loading.

    // That means suppose humne yak program bana liya.
    // Ab hum usko compile karge - javac A.java
    // Then Ab run karega - java A.java
    // Then iske bad humara JVM name ka software start ho jyga. mtlb program execute ho jyga, process start ho jygyi is process ka
    //Andar se two sub-process chalti he 1) main thread 2) GC- Garbage collector Thread .

    // Ab is main thread ke upper sabse phle jo kam hota he, bo he class loading . mtlb yaha se class ki jitni bhi information (variable, constructor, methods, etc) he
    // bo alg-alg memory ke andar jakar store ho jata he, JVM me 5 type ki memery hoti he

                                    // (OR)

    // Converting Byte code into a binary code is called a class loading.

    // class loader are responsible for a class loading.
    // class loading run-time per hi hoti he.
    //class loading only 1 bar hi hoti he.

    //********************************* Types of Class Loader ***********************************
    //1)  BootStreap class Loader
    //2) Extensions class Loader
    //3) System class Loader

    //*************************** Types Of Class Loading **************************************
    //1) Static Loading.
    //2) Dynamic Loading.

}
