//
// This is only a SKELETON file for the 'Resistor Color' exercise. It's been provided as a
// convenience to get you started writing code faster.
//

const colors = ["black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"];
export const colorCode = (color) => {
  return colors.indexOf(color.toLowerCase());
};

export const COLORS = colors;
