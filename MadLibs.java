import java.util.Scanner;

public class MadLibs {

    public static void main(String[] args) {

        String blankMadLibs = "I went to the <adjective> farm, to <verb> with each of the <noun>.";
        // Now I'm going to prompt the user for each word type I need to fill in the
        // blanks
        // creating a scanner to proccess the user inputs
        Scanner scan = new Scanner(System.in);

        // prompts the User
        System.out.println("Type an adjective: ");
        // gets the user input Adjective
        String userAdjective = scan.nextLine();

        // prompts the User
        System.out.println("Type an Verb: ");
        // gets the user input Verbwhi
        String userVerb = scan.nextLine();

        // prompts the User
        System.out.println("Type an Noun: ");
        // gets the user input Noun
        String userNoun = scan.nextLine();

        // Replace <adjective> by finding the starting and ending index of <adjective>
        int adjIndexStart = blankMadLibs.indexOf("<adjective>");
        int adjIndexEnd = adjIndexStart + "<adjective>".length();
        String firstPart = blankMadLibs.substring(0, adjIndexStart);
        String secondPart = blankMadLibs.substring(adjIndexEnd);
        String updatedMadLibs = firstPart + userAdjective + secondPart;

        // Replace <verb> by finding the starting and ending index of <adjective>
        int verbIndexStart = updatedMadLibs.indexOf("<verb>");
        int verbIndexEnd = verbIndexStart + "<verb>".length();
        firstPart = updatedMadLibs.substring(0, verbIndexStart);
        secondPart = updatedMadLibs.substring(verbIndexEnd);
        updatedMadLibs = firstPart + userVerb + secondPart;

        // Replace <adjective> by finding the starting and ending index of <adjective>
        int nounIndexStart = updatedMadLibs.indexOf("<noun>");
        int nounIndexEnd = nounIndexStart + "<noun>".length();
        firstPart = updatedMadLibs.substring(0, nounIndexStart);
        secondPart = updatedMadLibs.substring(nounIndexEnd);
        updatedMadLibs = firstPart + userNoun + secondPart;

        // Final Print Statment
        System.out.println("Here is you costom story: " + updatedMadLibs);
    }
}
