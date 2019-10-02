#include <iostream>
#include <algorithm>
#include <string>
#include <ctype.h>
using namespace std;
bool IsSorted(int *tab,int r) {
	for (int x = 0; x <= r-2; x++) {
		if (tab[x] > tab[x + 1]) {
			if (x = 4) {
				return true;
			}
		}
		if (tab[x] = tab[x + 1]) {
			if (x = 4) {
				return true;
			}
			else if (tab[x] < tab[x + 1]) {
				return false;
			}
		}
	}
}
void printBackwards(int *a,int s) {
	int f = s - 1;
	for (int x = 0; x < s; x++) {
			cout << a[f - x] << endl;
	}
}
void printDots(int *a,int s) {
	for (int x = 0; x < s;x++) {
		for (int y = 0; y < a[x];y++) {
			cout << ".";
		}
		cout << endl;
	}
}
void intSum(int *a, int s) {
	int wynik=0;
	for (int x = 0; x < s; x++) {
		wynik=wynik + a[x];
	}
	cout << wynik<<endl;
}
int getLength(char *a) {
	int s = 0;
	for (int x = 0; x < sizeof(a); x++) {
		s++;
	}
	cout << s-1 << endl;
	return s - 1;
}
void Reverse(char *str) {
	for (int i = 0; i<sizeof(str) / 2; i++)
	{
		char temp = str[i];
		str[i] = str[sizeof(str) - i - 1];
		str[sizeof(str) - i - 1] = temp;
	}
}
bool containsDigits(char *str) {
	int s = sizeof(str) / 2;
	for (int x = 0; x < s;x++) {
		if (isdigit(str[x])) {
			return true;
		}
	}
	return false;
}
int main() {
	//zadanie 1.1
	int tab1[5];
	for (int x = 0; x <= 4;x++) {
		cout << "Podaj " << x + 1 << " liczbe:" << endl;
		cin >> tab1[x];
	}
	cout << *max_element(tab1,tab1+5) << endl;
	//zadanie 1.2
	cout << "normalnie" << endl;
	for (int x = 0; x <= 4; x++) {
		cout << tab1[x]<<endl;
	}
	cout << "od konca" << endl;
	for (int x = 0; x <= 4; x++) {
		cout << tab1[4-x] << endl;
	}
	//zadanie 1.3
	for (int x = 0; x <= 3; x++) {
		if (tab1[x] > tab1[x + 1]) {
			if (x = 4) {
				cout <<  "niemalejaca" << endl;
				break;
			}
		}
		if (tab1[x] = tab1[x + 1]) {
			if (x = 4) {
				cout <<  "niemalejaca" << endl;
				break;
			}
			else if (tab1[x] < tab1[x + 1]) {
				cout <<  "malejaca" << endl;
				break;
			}
		}
	}
	//zadanie 2.1
	short wynik = IsSorted(tab1, size(tab1));
	if ( wynik= true) {
		cout << "niemalejaca" << endl;
	}
	else {
		cout << "malejaca" << endl;
	}
	//zadanie 2.2
	printBackwards(tab1, size(tab1));
	//zadanie 2.3
	printDots(tab1,size(tab1));
	//zadanie 2.4
	intSum(tab1, size(tab1));
	//zadanie 2.5
	int t;
	for (int x = 0; x < 25;x++) {
		for (int y = 0; y < 4;y++) {
			if (tab1[y] > tab1[y + 1]) {
				t = tab1[y];
				tab1[y] = tab1[y + 1];
				tab1[y + 1] = t;
			}
				
		}
	}
	char text[50];
	cout << "podaj tekst" << endl;
	cin >> text;
	containsDigits(text);
	Reverse(text);
	getLength(text);
	//zadania 4
	cout << "podaj liczbê n" << endl;
	int n;
	cin >> n;
	int*tab;
	tab=(int*)malloc(sizeof(int)*n);
	for (int x = 0; x < n; x++) {
		cout << "podaj " << x + 1 << " liczbe" << endl;
		cin >> tab[x];
	}
	printBackwards(tab,sizeof(tab));
	int l = 0;
	for (int x = 0; x < sizeof(tab); x++) {
		if (tab[x] < 0) {
			l++;
		}
	}
	int* tab2;
	tab2 = (int*)malloc(sizeof(int)*n);
	int k = 0;
	for (int x = 0; x < sizeof(tab); x++) {
		if (tab[x] < 0) {
			tab2[k] = tab[x];
			k++;
		}
	}
	free(tab);
	free(tab2);
	system("PAUSE");
	return 0;
}
