#include <iostream>;
#include <fstream>;
#include <stdio.h>;
#include <stdlib.h>;
#include <string>;
using namespace std;
typedef struct Node Node;
struct Node {
	int main;
	int value;
	Node*Next;
};

using namespace std;
void zadanie3_1() {
	int liczba = 1;
	fstream plik;
	plik.open("numbers.txt", ios::out | ios::trunc);
	while (liczba != 0) {
		std::cout << "Podaj liczbê" << std::endl;
		std::cin >> liczba;
		plik << liczba << "\n";
	}
	plik.close();
}
Node* Create(int val) {
	Node*main=new Node;
	main->main = 0;
	main->value = val;
	main->Next = NULL;
}

int main() {

	struct Student {
	int Age;
	int Height;
	int Semester;
	};
	Student*Micha³ = (Student*)malloc(sizeof(Student));
	Student*Marek = (Student*)malloc(sizeof(Student));
	Student*Sebastian = (Student*)malloc(sizeof(Student));
	Micha³->Age=20;
	Micha³->Height = 180;
	Micha³->Semester = 1;
	Marek->Age = 25;
	Marek->Semester = 2;
	Marek->Height = 150;
	Sebastian->Age = 35;
	Sebastian->Height = 210;
	Sebastian->Semester = 3;
	
	std::cout << "Michal:" << std::endl;
	std::cout << "Age: " << Micha³->Age <<"yo"<< std::endl;
	std::cout << "Height: " << Micha³->Height << "cm" << std::endl;
	std::cout << "Semester: " << Micha³->Semester << std::endl;
	std::cout << endl;
	std::cout << "Marek:" << std::endl;
	std::cout << "Age: " << Marek->Age << "yo" << std::endl;
	std::cout << "Height: " <<Marek->Height << "cm" << std::endl;
	std::cout << "Semester: " << Marek->Semester << std::endl;
	std::cout<<endl;
	std::cout << "Sebastian:" << std::endl;
	std::cout << "Age: " << Sebastian->Age << "yo" << std::endl;
	std::cout << "Height: " << Sebastian->Height << "cm" << std::endl;
	std::cout << "Semester: " << Sebastian->Semester << std::endl;
	std::cout << endl;
	
	free(Micha³);
	free(Sebastian);
	free(Marek);
	};
	
	zadanie3_1();
	Node*root = Create(2);
	system("pause");
	return 0;
}