public class May10Dragos {
//StringBuilder Class helps with efficency, multiple garbace collections were eligible if we use just String to solve
    StringBuilder alpha = new StringBuilder();
    for(char current = 'a'; current <= 'z'; current++)
        alpha.append(current);
    System.out.println(alpha);

}