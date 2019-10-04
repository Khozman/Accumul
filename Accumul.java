package kata.Accumul;

public class Accumul {
    public static void main(String[] args) {
        String str = "Bhekinkosi";
        String strLower = str.toLowerCase();
        int numberOfChar = str.length();

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < numberOfChar; i++){
            for(int j = 0; j < numberOfChar; j++){
                if(j <= i) {
                    if(j == 0){
                        sb.append(strLower.toUpperCase().charAt(i));
                    } else {
                        sb.append(strLower.charAt(i));
                    }
                }
            }
            if(i != numberOfChar-1) {
                sb.append("-");
            }
        }
        System.out.println(sb);
    }
}
