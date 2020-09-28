#include <iostream>
#include <random>
#include <ctime>
#include <math.h>
//#include <pthread.h>

using namespace std;

class PolarGen {
public:

	bool nincsTarolt;
	double tarolt;

	PolarGen() {
		srand(time(NULL));
		nincsTarolt = true;
	}

	double kovetkezo() {

		if (nincsTarolt) {
			double n1, n2, v1, v2, s;

			do {
				n1 = rand() / (RAND_MAX + 1.0);
				n2 = rand() / (RAND_MAX + 1.0);

				v1 = 2 * n1 - 1;
				v2 = 2 * n2 - 1;

				s = n1 * n2 + v1 * v2;

			} while (s > 1);

			double r = sqrt((-2 * log(s)) / s);
			tarolt = r * v2;
			nincsTarolt = !nincsTarolt;
			return r * v1;
		}
		else {

			nincsTarolt = !nincsTarolt;
			return tarolt;
		}
	}
};


int main(int argc, char **argv) {

	PolarGen gen;

	for (int i = 0; i < 10; i++) {
		cout << gen.kovetkezo()<<"\n";

	}

	return 0;
}
