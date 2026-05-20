private String username; 
/**
* Creates a username based on the parameter requestedName. If the
* username is unavailable, appends successive integers, beginning
* with 1, to requestedName until an available username is found,
* as described in part (a).
*/
public Account(String requestedName){
  int i=1;
  String temp = requestedName;
  while(!isAvailable(requestedName)){
    username =temp+i;
    i++;
  }
  
}



  
/**
* Returns true if the parameter str is an available username;
* returns false otherwise.
*/
public static boolean isAvailable(String str)
{ /* implementation not shown */ }
/**
