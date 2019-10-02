#include <string>
using namespace std;
class complex {
private:
	string item;
	string end;
public:
	complex(string item) {
		this->item = item;
	}
	string showitem() {
		return item;
	}
	string ToString() {
		string w;
		char string1;
		char string2;
		int dot = 0;
		int zeros;
		int zeros_final;
		for (int x = 0; x < item.length(); x++) {
			string1 = item[x];
			string2 = item[x + 1];
			if (string1 == '.') { dot = x; }
			else if (string1 == 'M') { zeros = 6; break; }
			else if (string1 == 'B') { zeros = 9; break; }
			else if (string1 == 'T') { zeros = 12; break; }
			else if (string1 == 'Q' && string2 == 'a') { zeros = 15; break; }
			else if (string1 == 'Q' && string2 == 'i') { zeros = 18; break; }
			else if (string1 == 'S' && string2 == 'x') { zeros = 21; break; }
			else if (string1 == 'S' && string2 == 'p') { zeros = 24; break; }
			else if (string1 == 'O' && string2 == 'c') { zeros = 27; break; }
			else w = w + string1;
		}
		if (dot != 0) {
			zeros_final = item.length() - dot - 2;
			zeros = zeros - zeros_final;
		}
		for (int x = 0; x < zeros; x++) {
			w = w + "0";
		}
		this->end = w;
		return w;
	}
	string showend() {
		return end;
	}
};


class assert {
private:
	string item_num,item_letter;
public:
	assert(string item_letter,string item_num) {
		this->item_letter = item_letter;
		this->item_num = item_num;
	}
	int AreEqual() {
		complex *temp = new complex(item_letter);
		string end = temp->ToString();
		delete temp;
		if (end == item_num)
			return 1;
		else
			return 0;
	}
};
