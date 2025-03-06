
        const images = [
            'images/img1.jpeg',
            'images/img2.jpeg',
            'images/img3.jpeg',
        ];
        
        let currentIndex = 0;
        const slider = document.getElementById("slider");
        
        function showImage(index) {
            slider.src = images[index];
        }
        
        function prevImage() {
            currentIndex = (currentIndex - 1 + images.length) % images.length;
            showImage(currentIndex);
        }
        
        function nextImage() {
            currentIndex = (currentIndex + 1) % images.length;
            showImage(currentIndex);
        }
        
        showImage(currentIndex);
 