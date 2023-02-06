package Covariant_ReturnType;

 class A {

    A show() {
        System.out.println("This is A method");
        return this;
    }
}

class B extends A {

    @Override
    B show() {
        System.out.println("This is A method");
        return this;
    }
}

class Test{
        public void main(String args[]){
            B b = new B();
            b.show();
        }
  }


