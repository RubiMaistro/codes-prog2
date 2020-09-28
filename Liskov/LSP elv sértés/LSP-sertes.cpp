#include <iostream>
#include <string>

using namespace std;

class Madar {
public:
	void fly(string nev) {
		nev = nev.erase(0, 6);
		cout << "A " << nev << " repül.\n";
	} 

	string nev = typeid(Madar).name();
	
};

class Golya : public Madar{
public:
	string nev = typeid(Golya).name();
};

class Struc : public Madar{
public:
	string nev = typeid(Struc).name();
};


int main() {

	setlocale(LC_ALL, "hun");

	Madar madar;
	Golya golya;
	Struc struc;

	madar.fly(madar.nev);
	golya.fly(golya.nev);
	struc.fly(struc.nev);

	return 0;
}
