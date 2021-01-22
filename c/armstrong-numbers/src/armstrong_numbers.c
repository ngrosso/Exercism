#include "armstrong_numbers.h"

bool is_armstrong_number(int candidate)
{
    int result = 0;
    int number = candidate;
    while (candidate > 0)
    {
        int mod = candidate % 10;
        result += pow(mod,floor(log10(abs(number))) + 1);
        candidate = candidate / 10;
    }

    return result == number;
}
