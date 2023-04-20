def call(String cmd) {
    if(isUnix){
        return sh(cmd)
    }
    else{
        return bat(cmd)
    }
}