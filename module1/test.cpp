#include <iostream>

// Hàm nhập mảng
void intput(int n, int m, int a[][100])
{
    int i, j;
    for (i = 0; i < n; i++)
    {
        for (j = 0; j < m; j++)
        {
            scanf("%d", &a[i][j]);
        }
    }
}
// Hàm xuất mảng
void output(int n, int m, int a[][100])
{
    int i, j;
    for (i = 0; i < n; i++)
    {
        for (j = 0; j < m; j++)
        {
            printf("%d   ", a[i][j]);
        }
        printf("\n");
    }
}
// Hàm sắp xếp
void Sort(int n, int m, int a[][100])
{
    // 2 vòng lặp đầu tiên để duyệt hết tất cả các phần tử
    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j < m; j++)
        {
            // 2 vòng lặp sau để lấy lần lượt các phần tử nằm sau a[i][j] để so sánh với a[i][j]
            for (int k = i; k < n; k++)
            {
                // Biến t để nếu đang cùng hàng thì ta sẽ cho vòng lặp l chạy  j+1, nếu khác hàng thì ta duyệt hết hàng đó
                int t = 0;
                if (k == i)
                {
                    t = j + 1;
                }
                for (int l = t; l < m; l++)
                {
                    // So sánh phần tử a[i][j] với a[k][l] nếu mà  a[i][j] > a[k][l] thì ta đổi chỗ chúng
                    if (a[i][j] > a[k][l])
                    {
                        //Để sắp xếp giảm dần ta đổi dấu a[i][j] < a[k][l]
                        int temp = a[i][j];
                        a[i][j] = a[k][l];
                        a[k][l] = temp;
                    }
                }
            }
        }
    }
    output(n, m, a);
}

int main()
{
    int n, m;
    printf("Nhap n, m lan luot: ");
    scanf("%d %d", &n, &m);

    // Cap phat bo nho
    int a[100][100];

    // Nhap mang
    printf("\n------Nhap mang-----\n");
    intput(n, m, a);
    printf("\n------xuat mang-----\n");
    output(n, m, a);
    printf("\n------Mang tang dan-----\n");
    Sort(n, m, a);
}