\rm -rf .configuration/*.*
\rm -rf ~/repo/openome-sdk
\rm -rf `find . -name .svn`
svnadmin create ~/repo/openome-sdk
svn checkout file:///h/27/yijun/repo/openome-sdk .
svn add * > /dev/null
svn commit -m "init"
