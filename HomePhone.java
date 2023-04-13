public class HomePhone extends Phone implements AnswerCall{
    @Override
    public void makeCall() {
        System.out.println("Звоним по домашнему телефону");
    }

    @Override
    public void answerCall() {
        System.out.println("Принимаем вызов");
    }
}