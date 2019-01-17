package UnionFind;

import java.util.Random;

/**
 * @program: DataStructureAndAlgorithms
 * @author: mirrorming
 * @create: 2019-01-17 14:32
 **/

public class Client {
    public static void main(String[] args) {
        int size = 100000;
        int m = 100000;
        UnionFind1 uf1 = new UnionFind1(size);
        UnionFind2 uf2 = new UnionFind2(size);
        UnionFind3 uf3 = new UnionFind3(size);

        System.out.println("uf1: " + testUF(uf1, m));
        System.out.println("uf2: " + testUF(uf2, m));
        System.out.println("uf3: " + testUF(uf3, m));
    }

    public static double testUF(UF uf, int m) {
        int size = uf.getSize();
        Random random = new Random();
        long startTime = System.nanoTime();
        for (int i = 0; i < m; i++) {
            uf.union(random.nextInt(size), random.nextInt(size));
        }
        for (int i = 0; i < m; i++) {
            uf.isConnected(random.nextInt(size), random.nextInt(size));
        }
        long endTime = System.nanoTime();
        return (endTime - startTime) / 1000000000.0;
    }
}