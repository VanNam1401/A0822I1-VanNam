package thuc_hanh;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ReadFileExample {
    public void readFileText(String filePath) {
        try {
            //đọc file theo đường dẫn
            File file = new File(filePath);

            // kiểm tra nều file không tồn tại thì ném ra ngoại lệ
            if (!file.exists()) {
                throw new FileNotFoundException();
            }

            // đọc từng dòng của file và tiếng hành cộng lại
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = "";
            int sum = 0;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
                sum += Integer.parseInt(line);
            }
            br.close();

            // hiển thị ra màn hình tổng các số nguyên trong file
            System.out.println("Tổng = " + sum);
        } catch (Exception e) {
//            th file không tồn tại nội dung file có lỗi
            System.out.println("File không tồn tại or nội dung có lỗi!");
        }
    }
}
