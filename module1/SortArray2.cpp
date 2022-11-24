
#include <iostream>

using namespace std;

int n, m, a[10][10], b[100], k;

void nhapMang(int a[10][10], int n, int m)
{
    for (int i = 0; i < n; i++)
        for (int j = 0; j < m; j++)
            cin >> a[i][j];
}

void mangB(int a[10][10], int n, int m, int b[100])
{
    int k = 0;
    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j < m; j++)
        {
            b[k] = a[i][j];
            cout << b[k] << "\t";
            k++;
        }
    }
}

void sapxep(int b[100], int n, int m)
{
    for (int i = m * n; i > 0; i--)
    {
        for (int j = 0; j < i; j++)
            if (b[j] < b[j + 1])
            {
                int tmp;
                tmp = b[j];
                b[j] = b[j + 1];
                b[j + 1] = tmp;
            }
    }
}

void xuat(int b[100], int n, int m)
{
    for (int i = 0; i < n * m; i++)
    {
        cout << b[i] << "\t";
        if (i % m == m - 1)
            cout << endl;
    }
}

int main()
{
    cin >> n;
    cin >> m;

    nhapMang(a, n, m);

    cout << "chua sx: " << endl;
    mangB(a, n, m, b);

    cout << "\nda sx: " << endl;
    sapxep(b, n, m);
    xuat(b, n, m);
    return 0;
}