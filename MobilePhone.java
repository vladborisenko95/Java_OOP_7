public class MobilePhone extends Phone implements AnswerCall, Sms {
    @Override
    public void makeCall() {
        System.out.println("Звоним по мобилке");
    }

    @Override
    public void answerCall() {
        System.out.println("Принимаем вызов");
    }

    @Override
    public void sendSms() {
        System.out.println("Отправляем СМС");
    }

    @Override
    public void receiveSms() {
        System.out.println("Получаем СМС");
    }
}