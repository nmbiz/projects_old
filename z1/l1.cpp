#include <iostream>
#include <string>

using namespace std;

string ConvertFromSymbolic(string st) {
	int wynik;
	string w;
	char string1;
	char string2;
	int kropka = 0;
	int zera;
	int zera_final;
	for (int x = 0; x < st.length(); x++) {
		string1 = st[x];
		string2 = st[x + 1];
		if (string1 == '.') { kropka = x; }
		else if (string1 == 'M') { zera = 6; break; }
		else if (string1 == 'B') { zera = 9; break; }
		else if (string1 == 'T') { zera = 12; break; }
		else if (string1 == 'Q' && string2 == 'a') { zera = 15; break; }
		else if (string1 == 'Q' && string2 == 'i') { zera = 18; break; }
		else if (string1 == 'S' && string2 == 'x') { zera = 21; break; }
		else if (string1 == 'S' && string2 == 'p') { zera = 24; break; }
		else if (string1 == 'O' && string2 == 'c') { zera = 27; break; }
		else w = w + string1;
	}
	if (kropka != 0 ) {
		zera_final = st.length()-kropka-2;
		zera = zera- zera_final;
	}
	for (int x = 0; x < zera; x++) {
		w = w + "0";
	}
	return w;
}

int main() {

	cout << ConvertFromSymbolic("12.8723T") << endl;
	system("pause");
	return 0;
}