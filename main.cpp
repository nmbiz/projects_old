#include "complex.cpp";
#include <string>
#include <iostream>
using namespace std;
int main() {
	complex *n1=new complex("8.4454B");
	cout << n1->ToString() << endl;
	delete n1;
	assert *n2 = new assert("8.4454B", "8445400000");
	cout << n2->AreEqual() << endl;
	delete n2;
	assert *n3 = new assert("3.223332M", "1000");
	cout << n3->AreEqual() << endl;
	delete n2, n1;
	system("pause");
	return 0;
}