rcp::
	/usr/bin/time -f %E ./build.sh > build.log 

site:
	cp ../workspace/goalmodel/build-pde.xml ../workspace/goalmodel/build.xml
	cp ../workspace/goalmodel.feature/build-pde.xml ../workspace/goalmodel.feature/build.xml
	rm -rf update
	cd ../workspace/goalmodel.update; ../ant
	./sed.sh

download:
	cd download; make 

clean:
	cd ../workspace/goalmodel.update; ../ant clean
	rm -rf ../workspace/eclipse/*

run:
	cp .gtkrc-2.0 ${HOME}
	./eclipse.sh &
	
commit:
	cd ..; svn --force-log commit -m "update"
