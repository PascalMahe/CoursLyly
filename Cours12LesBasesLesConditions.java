public class Cours12LesBasesLesVariables {

	public static void main(args[]){
		
		boolean test = true;
		if(test == true){
			// passera ici
		}
		
		test = false;
		if(test == true){
			// ne passera pas par ici
		} else {
			// passera par là
		}
		
		int i = 5;
		if(i == 0){
			// ne passera pas par ici
		} else if(i == 2){
			// ne passera pas ici non plus
		}
		
		if(i == 0){
			// ??
		} else if(i == 2){
			// ??
		} else {
			// ??
		}
		
		
		switch(i) {
            case 1:
                // ne passera pas ici
                break;
            case 2:
                // ne passera pas ici
                break;
            case 3:
                // ne passera pas ici
                break;
            default:
                // passera ici
                break;
        }
		
		
		switch(i) {
            case 1:
                // ne passera pas ici
                break;
            case 2:
                // ne passera pas ici
                break;
            case 5:
                // passera ici
                break;
            default:
                // ne passera pas ici
                break;
        }
		
		//------------------------------
		//  EXERCICES
		//------------------------------
		
		int i = 4;
		switch(i) {
            case 1:
                // ??
                break;
            case 2:
                // ??
                break;
            case 3:
                // ??
                break;
            default:
                // ??
                break;
        }
		
		
		int j = 4;
		if(j < 5){
			j = 3;
		}
		switch(i) {
            case 1:
                // ??
                break;
            case 2:
                // ??
                break;
            case 3:
                // ??
                break;
			case 4:
                // ??
                break;
            default:
                // ??
                break;
        }
		
		
		int h = 6;
		if(h <= 5){
			h = 3;
		} else {
			h = 1;
		}
		switch(i) {
            case 1:
                // ??
                break;
            case 2:
                // ??
                break;
            case 3:
                // ??
                break;
			case 4:
                // ??
                break;
            default:
                // ??
                break;
        }
	}                  

}                      