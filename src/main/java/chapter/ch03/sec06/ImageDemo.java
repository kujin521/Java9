package chapter.ch03.sec06;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 */
public class ImageDemo {
    /**
     *
     * @param width
     * @param height
     * @param f
     * @return
     */
    public static BufferedImage createImage(int width, int height, PixelFunction f) {
//        描述的Image与图像数据的访问的缓冲器
        BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);

        for (int x = 0; x < width; x++)
            for (int y = 0; y < height; y++) {
                Color color = f.apply(x, y);
                image.setRGB(x, y, color.getRGB());
            }
        return image;
    } 
    
    public static void main(String[] args) throws IOException {
        BufferedImage frenchFlag = ImageDemo.createImage(
                150, 100,
            (x, y) -> //调用PixelFunction 函数式接口apply
                    x < 50 ?
                    Color.BLUE : x < 100 ?
                            Color.WHITE : Color.RED);
        Path path = Paths.get("flag.png");
//        写入使用任意一个图像ImageWriter支持给定格式的File 。
//        如果已经有一个File存在，其内容将被丢弃。
        ImageIO.write(frenchFlag, "PNG", path.toFile());
        System.out.println("Image saved to " + path.toAbsolutePath());
    }
}
