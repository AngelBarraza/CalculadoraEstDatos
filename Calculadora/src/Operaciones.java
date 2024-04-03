public class Operaciones {
    float x;
    float y;

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    static float Suma(float x, float y) {
        float z = x + y;
        return z;
    }

    static float Resta(float x, float y) {
        float z = x - y;
        return z;
    }

    static float Divison(float x, float y) {
        float z = x / y;
        return z;

    }

    static float Multiplicacion(float x, float y) {
        float z = x * y;
        return z;

    }

    static float Resto(float x, float y) {
        float z = x % y;
        return z;

    }
}
