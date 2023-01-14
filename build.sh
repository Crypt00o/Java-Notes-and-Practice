
banner_plus_usage(){
	  echo "[+] Java Notes Projects Created by 0xCrypt00o While Studing java Again but in depth 
	  
			[+] Usage:
				  ./build.sh run             // for run 
				  ./build.sh build			 // for build then build 
				  ./build.sh build run       // for build then run 
				  ./build.sh build-run       // for build then run 
				  ./build.sh clean-build-dir    // for clearning build dir 

			https://github.com/Crypt00o/java-notes-and-practice
			
			"

}

main(){
	  for i in $*
	  do
			case $i in 
			
				  run)
						java --class-path ./build Main
				  ;;
				  build)
						javac --class-path ./src ./src/Main.java  -d ./build
				  ;;
				  build-run)

						javac -cp ./src ./src/Main.java  -d ./build && java -cp ./build Main
				  
				  ;;
				  clean-build)
						rm -rf ./build/
				  ;;

				  *|**)
						banner_plus_usage
				  ;;

			esac
	  
	  done
	  if [ -z $1 ]
	  then 
			banner_plus_usage
	  fi

}

main $*
