package task_1;

import java.util.Objects;

/**
 * Клас для зберігання та обробки даних параболи y = ax^2 + bx + c.
 * Забезпечує обчислення значень y по x та навпаки.
 */
public class Parabola {
    private double a, b, c;

    /**
     * Конструктор для ініціалізації коефіцієнтів параболи.
     *
     * @param a коефіцієнт a
     * @param b коефіцієнт b
     * @param c вільний член c
     */
    public Parabola(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    /**
     * @return коефіцієнт a параболи
     */
    public double getA() {
        return a;
    }

    /**
     * @return коефіцієнт b параболи
     */
    public double getB() {
        return b;
    }

    /**
     * @return вільний член c параболи
     */
    public double getC() {
        return c;
    }

    /**
     * Обчислює значення y для заданого x.
     *
     * @param x значення аргументу
     * @return значення функції y
     */
    public double calculateY(double x) {
        return a * x * x + b * x + c;
    }

/**
 * Обчислює значення x для заданого y.
 *
 * @param y значення функції
 * @return масив коренів рівняння
 * @throws Exception якщо дискримінант менше 0
 */

    public double[] calculateX(double y) throws Exception {
        double discriminant = Math.pow(b, 2) - 4 * a * (c - y);
        if (discriminant < 0) {
            throw new Exception("Discriminant < 0");
        }
        double sqrtD = Math.sqrt(discriminant);
        return new double[]{
            (-b + sqrtD) / (2 * a),
            (-b - sqrtD) / (2 * a)
        };
    }

    @Override
    public String toString() {
        return String.format("y = %.2fx^2 + %.2fx + %.2f", a, b, c);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;

        Parabola function = (Parabola) obj;
        return Double.compare(function.a, a) == 0 &&
               Double.compare(function.b, b) == 0 &&
               Double.compare(function.c, c) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b, c);
    }
}
