#include <iostream>

using namespace std;

class Parent {
public:
	void printParent() {
		cout << "Parent.\n";
	}
};

class Child : public Parent{
public:
	void printChild() {
		cout << "Child.\n";
	}
};

int main() {

	Parent parent;
	Child child;

	parent.printParent();
	child.printChild();
	child.printParent();

	//parent.printChild();
	
	return 0;
}