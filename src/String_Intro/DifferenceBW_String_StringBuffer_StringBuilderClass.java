package String_Intro;

public class DifferenceBW_String_StringBuffer_StringBuilderClass {

  /*
    String                                  StringBuffer                                    StringBuilder
    string are store in heap                 StringBuffer are store in heap               StringBuilder Are store in heap
    memory area and string constant          memory area.                                  memory area.
    pool.

    String are always create a immutable      StringBuffer are always create            StringBuilder are always create a
    object.                                   a mutable object.                          mutable object.

    if we change the value of string a lot    StringBuffer occupie a less               StringBuilder occupie a less memory.
    of time , it will allocate more memory.    memory.

    String are not thread safe, because in     StringBuffer thred are safe because     StringBuilder thred are not safe, because
    a stirng memory are non synchronized.       memory are synchronized,               memory are non synchronized.

    performance are slow.                     compare to string performance are fast.   compare to stringbuffer performance are fast.
   */
}
