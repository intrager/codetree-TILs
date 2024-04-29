#include <iostream>
#include <string>
#include <climits>
#include <cctype>
#include <algorithm>
#include <functional>
#include <tuple>
#include <utility>
using namespace std;

class Pos {
public:
    int x, y, idx;

    Pos(int x, int y, int idx) {
        this->x = x;
        this->y = y;
        this->idx = idx;
    }

    Pos(){}
};

bool cmp(const Pos &a, const Pos &b) {
    int dist_a = abs(a.x) + abs(a.y);
    int dist_b = abs(b.x) + abs(b.y);

    if(dist_a == dist_b) {
        return a.idx < b.idx;
    }
    return dist_a < dist_b;
}

int main() {
    int n; cin >> n;

    Pos pos[n];

    int x, y;
    int idx = 1;

    for(int i = 0; i < n; i++) {
        cin >> x >> y;
        pos[i] = Pos(x, y, idx++);
    }

    sort(pos, pos + n, cmp);

    for(int i = 0; i < n; i++) {
        cout << pos[i].idx << endl;
    }
    return 0;
}