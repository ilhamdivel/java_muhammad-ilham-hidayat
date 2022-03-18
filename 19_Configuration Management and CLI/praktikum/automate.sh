dateNow="$(date +"%a %b %d %T WIB %Y")"
fileName="$1 at ${dateNow}"
mkdir "$fileName"
cd "$fileName"
mkdir "about_me"
mkdir "my_friends"
mkdir "my_system_info"
cd about_me
mkdir "professional"
mkdir "personal"
cd personal
fbURL="http://www.facebook.com/$2"
echo "$fbURL" > facebook.txt
cd ..
cd professional
linkedinURL="https://www.linkedin.com/in/$3"
echo "$linkedinURL" > linkedin.txt
cd ..
cd ..
cd my_friends
curl -o list_of_my_friends.txt "https://gist.githubusercontent.com/tegarimansyah/e91f335753ab2c7fb12815779677e914/raw/94864388379fecee450fde26e3e73bfb2bcda194/list%2520of%2520my%2520friends.txt"
cd ..
cd my_system_info

echo "My Username: $USER" > about_this_laptop.txt
echo -n "With host: " >> about_this_laptop.txt
uname -a >> about_this_laptop.txt

echo "Connection to google: " > internet_connection.txt
ping -c 3 forcesafesearch.google.com >> internet_connection.txt