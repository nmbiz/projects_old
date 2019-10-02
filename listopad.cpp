#include <stdio.h>
#include <iostream>
#include <math.h>
#include <cstdlib>

using namespace std;

int z1_4(int n) {
	if (n % 2 == 0) {

		if (n == '0') {
			cout << "rowna 0" << endl;
		}
		else if (n > 0) {
			cout << "wieksza od 0" << endl;
		}
		else {
			cout << "mniejsza od 0" << endl;
		}
	}
	return 0;
}
int z1_5(int a,int b,int c) {
	cout << "najwiêksza jest liczba:";
	if (a > b) {
		if (a > c) {
			cout << a<<endl;
		}
	}
	if (b > a) {
		if (b > c) {
			cout << b<<endl;
		}
	}
	if (c > a) {
		if (c > b) {
			cout << c <<endl;
		}
	}
	return 0;
}
int z1_6() {
	float wynik;
	float pierwsza;
	float druga;
	char ope;
		cout << "pierwsza" << endl;
		cin >> pierwsza;
		cout << "druga cyfra" << endl;
		cin >> druga;
		cout << "operator" << endl;
		cin >> ope;
		switch (ope) {
		case '-':
			wynik= pierwsza - druga;
		case '+':
			wynik= pierwsza + druga;
		case '/':
			wynik= pierwsza / druga;
		case '*':
			wynik= pierwsza*druga;
		case '^':
			wynik= pow(pierwsza, druga);
		}
		cout << wynik << endl;

	return 0;
}
void new_line() {
	cout << "" << endl;
}
void new_lines(int count) {
	for (int z = 0; z < count; z++) {
		cout << "" << endl;
	}
}
void WriteBiggerNumber(int x, int y) {
	if (x > y) {
		cout << "Wieksza jest cyfra:"<<x << endl;
	}
	else if (x == y) {
		cout << "Sa rowne" << endl;
	}
	else {
		cout << "Wieksza jest cyfra:" << y << endl;
	}
}
int multiply(int x,int y) {
	return x*y;
}

int main() {
	int przyklad1 = 12;
	float przyklad2 = 12.8333;
	char przyklad3 = 'M';
	cout << przyklad1 << endl << przyklad2 << endl << przyklad3 << endl;
	//zadanie 1.1
	printf("%d", przyklad1);
	//zadanie 1.2
	cout << endl << "podaj liczbe:";
	int x;
	cin >> x;
	cout << endl << pow(x,2)<<endl;
	//zadanie1.3
	z1_4(x);
	//zadanie1.4
	int x1;
	int x2;
	int x3;
	cout << "x1" << endl;
	cin >> x1;
	cout << "x2" << endl;
	cin >> x2;
	cout << "x3" << endl;
	cin >> x3;
	z1_5(x1,x2,x3);

	//zadanie 1.5
	char odp='y';
	while (odp == 'y') {
		z1_6();
		cout << "powtorzyc?(y/n)" << endl;
		cin >> odp;
	}
	//zadanie 1.6
	int f;
	cin >> f;
	while (f) {
		if (f == 0) {
		break;
		}
		else {
			cout << f << endl;
			break;
		}
	}
	//zadanie 2.1
	int liczba;
	cin >> liczba;
	for (int x = 1; x < 1000000;x++) {
		if (pow(liczba, x) > 100000) {
			break;
		}
		cout << pow(liczba, x) << endl;
	}
	//zadanie 2.3
	int m;
	cin >> m;
	while (m > 0) {
		m--;
		cout << m << endl;
	}
	//zadanie 2.4
	int y1;
	int x1;
	cin >> x1;
	cin >> y1;
	for (int x = x1+1; x < y1;x++) {
		cout << x << endl;
	}
	//zadanie 2.7
	int x2;
	cin >> x2;
	for (int x = x2 - 1; x > 0; x--) {
		cout << x << endl;
	}
	//zadanie 2.8
	int x3;
	cin >> x3;
	for (int x = x3 + 3; x < 100;x++) {	
		cout << x << endl;
		x = x + 2;
	}
	//zadanie 2.9
	new_line();
	//zadanie 3.1
	int lines;
	cin>>lines;
	new_lines(lines);
	//zadanie 3.2
	int y;
	int x;
	cin >> y;
	cin >> x;
	WriteBiggerNumber(x, y);
	//zadanie 3.3
	int x;
	int y;
	cin >> x;
	cin >> y;
	cout << multiply(x, y) << endl;
	system("PAUSE");
	return 0;

}