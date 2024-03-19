package Car;

public interface Unlock {
        default void checkKey(int Carkey, int[] keys) {
            boolean keyMatch = false;
            for (int key : keys) {
                if (Carkey == key) {
                    keyMatch = true;
                    break;
                }
            }
            if (keyMatch)
                System.out.println("Машина открыта и заведена");
                else
                System.out.println("Не удалось завести и открыть машину");
            }
        }

