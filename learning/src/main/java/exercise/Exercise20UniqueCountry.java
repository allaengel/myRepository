package exercise;
 
public class Exercise20UniqueCountry {
    public static void main(String args[]){
        Exercise19Country[] duplicateCountryArr = new Exercise19Country[10];
        Exercise19Country can1 = new Exercise19Country ("CAN", "Canada", 35540419, "CN Dollar");
        Exercise19Country can2 = new Exercise19Country ("CAN", "Canada", 35500000, "Looney");
        Exercise19Country usa1 = new Exercise19Country ("USA", "United States", 319072000, "US Dollar");
        Exercise19Country usa2 = new Exercise19Country ("USA", "United States", 319072000, "Buck");
        Exercise19Country ita1 = new Exercise19Country ("ITA", "Italy", 60783711, "Euro");
        Exercise19Country ita2 = new Exercise19Country ("ITA", "Italia", 60780000, "Lira");
        Exercise19Country esp1 = new Exercise19Country ("ESP", "Spain", 46507760, "Euro");
        Exercise19Country esp2 = new Exercise19Country ("ESP", "Espana", 46500000, "Peseta");
        Exercise19Country eng1 = new Exercise19Country ("ENG", "England", 64105654, "Pound");
        Exercise19Country eng2 = new Exercise19Country ("ENG", "United Kingdom", 64105654, "Lb");
        duplicateCountryArr[0]=can1;
        duplicateCountryArr[1]=can2;
        duplicateCountryArr[2]=usa1;
        duplicateCountryArr[3]=usa2;
        duplicateCountryArr[4]=ita1;
        duplicateCountryArr[5]=ita2;
        duplicateCountryArr[6]=esp1;
        duplicateCountryArr[7]=esp2;
        duplicateCountryArr[8]=eng1;
        duplicateCountryArr[9]=eng2;
         
        Exercise19Country[] uniqueCountryArr = new Exercise19Country[5];
        int arrayIndex=0;
       
        Exercise19Country prevCountry = null;
        for(int i=0; i<10; i++){
            if(i == 0){//if it's the first item in dup array, to to the next index
            	//first index of unique array set to first index of dup array
                uniqueCountryArr[arrayIndex] = duplicateCountryArr[i];
                //prevCountry var is set to value of index of the unique array
                prevCountry = uniqueCountryArr[i];
                arrayIndex++;//to to the next item in the unique array
                continue;  //immediately go to the next i in the for loop             
            }else{//if it's not the first item in the array
            	//set var curCnry to the value of the index i (
            	
            	//WHY we don't take THE FIRST ITEM IN THE ARRAY (since i is now 1)???
            	
                Exercise19Country currentCountry = duplicateCountryArr[i];
                
                //if previous item (1st in array) not equals second in array(since i=1 now)
                if(!prevCountry.equals(currentCountry)){
                	//index of unique array set to second item in array
                    uniqueCountryArr[arrayIndex] = currentCountry;
                    arrayIndex++;//array index moves to second item
                    prevCountry = currentCountry;//prevCountry moves to 2nd item in array
                    continue;//immediately move to above if(line 55)
                }
            }
            System.out.println("Going to next step");
        }
        System.out.println("Printing main array with size of : "+duplicateCountryArr.length);
        for(Exercise19Country country : duplicateCountryArr){
            System.out.println("Country code is " +country.getCountryCode());
        }
        System.out.println("--------------------------------------------");
        System.out.println("Printing unique array with size of :"+uniqueCountryArr.length);
        for(Exercise19Country country : uniqueCountryArr){
            System.out.println("Country code is " +country.getCountryCode());
        }
    }

}
