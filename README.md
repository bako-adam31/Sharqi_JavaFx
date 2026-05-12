# Sharqi - Fragrance Explorer Application 🌟

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-it-badge&logo=openjdk&logoColor=white)
![JavaFX](https://img.shields.io/badge/JavaFX-000000?style=for-the-badge&logo=java&logoColor=white)
![Maven](https://img.shields.io/badge/Maven-C71A36?style=for-the-badge&logo=apachemaven&logoColor=white)

**Sharqi** is a modern desktop application built with JavaFX designed to help you explore the vast world of perfumery. Search for your favorite scents, browse by olfactory notes and accords, and discover budget-friendly alternatives (clones) to popular luxury fragrances.

## ✨ Key Features

* **🔍 Advanced Search:** Search through an extensive database of fragrances powered by the Fragella API.
* **📖 Detailed Perfume Profiles:**
    * Core information (Brand, release year, rating, country of origin).
    * Performance metrics (Sillage and Longevity).
    * Olfactory pyramid (Top, Middle, and Base notes) with visual representation.
    * Main fragrance accords with percentage-based bars.
    * Recommendations based on seasons (Winter, Summer, etc.) and occasions (Office, Date, etc.).
* **🧪 Filter Search:** Find perfumes by specific notes (e.g., bergamot, vanilla) or main accords (e.g., leather, woody).
* **🧬 Clone Discovery:** A dedicated section to find high-quality, affordable alternatives to expensive niche and designer perfumes (featuring brands like Lattafa, Maison Alhambra, and Fragrance World).
* **💡 Similar Scents:** Automatically view similar fragrances on each perfume's detail page.

## 🎨 UI/UX Design

The application features a unique, modern aesthetic:
* **Glassmorphism:** The home page utilizes translucent, glass-like cards for a sleek look.
* **Responsive Layout:** Built using `SplitPane` and flexible containers (`TilePane`, `FlowPane`) to ensure a smooth user experience.
* **Custom CSS Styling:** Features rounded corners, subtle shadows, color-coded performance badges, and dynamic accord visualization.

## 🛠️ Technologies Used

* **Language:** Java
* **User Interface:** JavaFX (FXML + CSS)
* **Build Tool:** Maven (`pom.xml`, Maven Wrapper)
* **Networking:** Standard `java.net.http.HttpClient`
* **JSON Processing:** Google Gson
* **Data Source:** [Fragella API](https://api.fragella.com/)

## 🚀 Getting Started

### Prerequisites
* Install Java Development Kit (JDK) 17 or newer (Project is configured for Java 25).
* Git (Optional, for cloning).

### Installation

1.  **Clone the repository:**
    ```bash
    git clone https://github.com/bako-adam31/Sharqi_JavaFx.git
    cd Sharqi_JavaFx
    ```

2.  **Run via Maven:**
    The project includes the Maven Wrapper, so you don't need to install Maven separately. Run the following command in your terminal:
    
    *On Windows:*
    ```cmd
    mvnw.cmd clean javafx:run
    ```
    
    *On Linux / macOS:*
    ```bash
    ./mvnw clean javafx:run
    ```

## 📂 Project Structure

* `src/main/java/org/example/sharqi/`: Java source files (Controllers, Models, Launcher).
    * `ParfumController.java`: Main logic, API integration, and UI updates.
    * `Parfum.java`, `Clone.java`, `DesignerFragrance.java`: OOP models and data structures.
* `src/main/resources/org/example/sharqi/`: FXML view files (`parfum-view.fxml`).
* `src/main/resources/styles.css`: Custom stylesheet for application styling.

## 🤝 Contributing

If you have ideas for improvements or found a bug, feel free to open an **Issue** or submit a **Pull Request**!

## 📝 License

This project is open-source. For more information, please check the LICENSE file (if available).
