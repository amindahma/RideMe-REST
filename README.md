                        cd /
                        /etc/init.d/rideme stop
                        sudo rm /etc/init.d/rideme
                        cd /home/RideMe-REST
                        git pull https://github.com/amindahma/RideMe-REST.git
                        cd /
                        sudo ln -s /home/RideMe-REST/target/RideMe-0.0.1-SNAPSHOT.jar /etc/init.d/rideme
                        ./etc/init.d/rideme start