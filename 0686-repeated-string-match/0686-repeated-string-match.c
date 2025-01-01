int repeatedStringMatch(char *a, char *b) {
    int aLen = strlen(a);
    int bLen = strlen(b);

    // Calculate the minimum number of repetitions needed
    int minReps = (bLen + aLen - 1) / aLen; // ceil(bLen / aLen)
    int c = minReps;

    // Create a buffer to temporarily hold the repeated string
    char temp[2 * aLen + bLen + 1]; // Enough to hold `a` repeated twice plus `b`

    // Repeat `a` `minReps` times and store in `temp`
    temp[0] = '\0'; // Initialize to empty string
    for (int i = 0; i < minReps; i++) {
        strcat(temp, a);
    }

    // Check if `b` is a substring of `temp`
    if (strstr(temp, b) != NULL) {
        return c;
    }

    // Add one more repetition of `a` to `temp`
    strcat(temp, a);
    c++;

    // Check again if `b` is a substring
    if (strstr(temp, b) != NULL) {
        return c;
    }

    // If `b` is not a substring, return -1
    return -1;
}
