package hello.core.singleton;

public class SingletonService {

    private static final SingletonService instance = new SingletonService();

    public static SingletonService getInstance() {
        return instance;
    }

    private SingletonService() { // 생성자를 private 로 막아서 객체를 1개만 유지
    }

    public void logic() {
        System.out.println("싱글톤 객체 로직 호출");
    }


}
