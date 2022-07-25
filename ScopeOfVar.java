public class ScopeOfVar {
// // Comment here

/*
your block of comments or a parra of comments here
*/

// Scope basically means the Level access

/*
1) Local scope --
2) block scope --
3) member scope --
4) loop scope --
*/

// local scope =====================================================================================

// accessible in your method
// public static void main(String[] args) {
// // local scope varibale
// int x = 0;
//
// {
// // code block
// // x is accesible here also
// }
// }

// x is not accessible here


// block scope ====================================================================
// public static void main(String[] args){
// // already declared x here
// int x = 0;
// {
// // won't allow re declaration
// //int x = 0;
// // it will allow this
// x = 10;
// int y = 20;
// // y is accessible here
// System.out.println(y);
// }
// System.out.println(x);
// // y not accessible here
// // System.out.println(y);
// }

// Member scope
// defined as a member element
// static int x = 20;
// public static void main(String[] args) {
// // So x is accessible to all the members of the root class
// System.out.println(x);
// }

    // loop scope
    public static void main(String[] args) {
        int x = 19;
        for(int i =0 ; i< 10 ; i++){
// i is accessible here
            System.out.println(x);
            System.out.println(i);
        }
// i not accessible as it is in loop scope
//System.out.println(i);
        System.out.println(x);
    }

}