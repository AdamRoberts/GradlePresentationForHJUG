function test1() {
    // The following should be a JSHint warning
    console && console.log('test1');
    return true;
}