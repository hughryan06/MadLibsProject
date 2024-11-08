import java.util.Scanner;

public class MadLibs {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String madLibTemplate = "Once upon a <adjective> night, a <animal> decided to <verb> with a <noun> under the <adjective> <place>.";

        // find and replace the first set of <>
        int openBracketIndex = madLibTemplate.indexOf("<");
        int closeBracketIndex = madLibTemplate.indexOf(">");
        String partOfSpeech = madLibTemplate.substring(openBracketIndex + 1, closeBracketIndex);

        System.out.print("please enter a " + partOfSpeech + ": ");
        String userInput = scanner.nextLine();

        String firstPart = madLibTemplate.substring(0, openBracketIndex);
        String lastPart = madLibTemplate.substring(closeBracketIndex + 1);
        madLibTemplate = firstPart + userInput + lastPart;

        // find and replace the next <>
        openBracketIndex = madLibTemplate.indexOf("<");
        closeBracketIndex = madLibTemplate.indexOf(">");
        partOfSpeech = madLibTemplate.substring(openBracketIndex + 1, closeBracketIndex);

        System.out.print("please enter an " + partOfSpeech + ": ");
        userInput = scanner.nextLine();

        firstPart = madLibTemplate.substring(0, openBracketIndex);
        lastPart = madLibTemplate.substring(closeBracketIndex + 1);
        madLibTemplate = firstPart + userInput + lastPart;

        // next <>
        openBracketIndex = madLibTemplate.indexOf("<");
        closeBracketIndex = madLibTemplate.indexOf(">");
        partOfSpeech = madLibTemplate.substring(openBracketIndex + 1, closeBracketIndex);

        System.out.print("please enter a " + partOfSpeech + ": ");
        userInput = scanner.nextLine();

        firstPart = madLibTemplate.substring(0, openBracketIndex);
        lastPart = madLibTemplate.substring(closeBracketIndex + 1);
        madLibTemplate = firstPart + userInput + lastPart;

        // another <>
        openBracketIndex = madLibTemplate.indexOf("<");
        closeBracketIndex = madLibTemplate.indexOf(">");
        partOfSpeech = madLibTemplate.substring(openBracketIndex + 1, closeBracketIndex);

        System.out.print("please enter a " + partOfSpeech + ": ");
        userInput = scanner.nextLine();

        firstPart = madLibTemplate.substring(0, openBracketIndex);
        lastPart = madLibTemplate.substring(closeBracketIndex + 1);
        madLibTemplate = firstPart + userInput + lastPart;

        // last <>
        openBracketIndex = madLibTemplate.indexOf("<");
        closeBracketIndex = madLibTemplate.indexOf(">");
        partOfSpeech = madLibTemplate.substring(openBracketIndex + 1, closeBracketIndex);

        System.out.print("please enter a " + partOfSpeech + ": ");
        userInput = scanner.nextLine();

        firstPart = madLibTemplate.substring(0, openBracketIndex);
        lastPart = madLibTemplate.substring(closeBracketIndex + 1);
        madLibTemplate = firstPart + userInput + lastPart;

        // print final story
        System.out.println("Here is your custom story: " + madLibTemplate);

        scanner.close();
    }
}
