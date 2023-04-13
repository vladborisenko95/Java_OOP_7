public class SmartPhone extends Phone implements AnswerCall, Sms, Email, Messenger {
    @Override
    public void makeCall() {
        System.out.println("Звоним по смартфону");
    }

    @Override
    public void answerCall() {
        System.out.println("Принимаем вызов");
    }

    @Override
    public void sendEmail() {
        System.out.println("Отправляем email");
    }

    @Override
    public void receiveEmail() {
        System.out.println("Получаем email");
    }

    @Override
    public void messeging() {
        System.out.println("Переписываемся в мессенджере");
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