Part B
Complete method getShortenedName.
/**
* Returns a shortened version of username with each hyphen ("-")
* and the character before it removed, as described in part (b)
* Preconditions: username does not start or end with a hyphen.
* username does not contain consecutive hyphens.
* username.length() >= 2
* Postcondition: username is unchanged.
*/
public String getShortenedName(){
  String result = username;
  while(result.equals("-")){
    int x = result.indexOf("-");
    result= result.substring(0,x-1)+result.substring(x+1);
  
  }
  return result;
}
