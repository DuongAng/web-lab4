import React from "react";

export default function Heading() {
    const styles = {
        h2: {
            fontFamily: "monospace",
            fontWeight: "bolder",
            fontSize: "250%",
            color: "rgb(0,0,0)",
            backgroundColor: "rgb(57,245,187)"
        }
    }
    return (
        <h2 style={styles.h2} align="center" id="authors">Зыонг Динь Ань, вариант 124451 , P3207</h2>
    )
}