//listing 19
// Ограничения дженериков: получить экземпляр по параметру типа нельзя.

class Gen<T> {
    T ob;

    Gen() {
        ob = new T(); // Illegal!!!
    }
}
