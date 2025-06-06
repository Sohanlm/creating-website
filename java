document.addEventListener("DOMContentLoaded", function () {
    const button = document.getElementById("toggleBtn");
    const backgrounds = [
        "url('https://raw.githubusercontent.com/Sohanlm/creating-website/refs/heads/main/naruto%2C%2C.jpg')",
        "url('https://raw.githubusercontent.com/Sohanlm/creating-website/refs/heads/main/sasuke.jpg')",
        "url('https://raw.githubusercontent.com/Sohanlm/creating-website/refs/heads/main/naruto%2C%2C.jpg')"
    ];
    let index = 0;

    button.addEventListener("click", function () {
        document.body.style.background = "none"; // Reset any existing background
        document.body.style.backgroundImage = backgrounds[index];
        document.body.style.backgroundSize = "cover"; // Ensure it covers the whole screen
        document.body.style.backgroundPosition = "center"; // Center the image
        index = (index + 1) % backgrounds.length;
    });
});
