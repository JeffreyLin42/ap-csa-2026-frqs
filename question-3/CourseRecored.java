/* The students enrolled in a history course */
private ArrayList<CourseRecord> historyList;
/* The students enrolled in a math course */
private ArrayList<CourseRecord> mathList;


public int moreHistoryThanMathAbsences(){
  int count=0;
  for(int i=0; i < historyList.size(); i++){
    for(int k=0; k< mathList.size();k++){
      String hisName = historyList.get(i).getStudentID();
      String mathName = mathList.get(k).getStudentID();
      int hisA = historyList.get(i).getAbsences();
      int mathA = mathList.get(i).getAbsences();
      if(hisName.equals(mathName)&& hisA>mathA){
        count++;
      }
    }
  }
  return count;
}
